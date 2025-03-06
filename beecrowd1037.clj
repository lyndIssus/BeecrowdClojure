(ns interval-checker)

(def intervalos [0 25 50 75 100])
(def strings ["[0,25]" "(25,50]" "(50,75]" "(75,100]"])

(defn check-interval [x]
  (cond
    (or (< x 0) (> x 100))
    (println "Fora de intervalo")
    
    (<= 0 x 25)
      (println (str "Intervalo " (first strings)))
    
    :else
      (doseq [i (range (- (count intervalos) 1))]
        (when (and (< (get intervalos i) x)
                  (<= x (get intervalos (inc i))))
          (println (str "Intervalo " (get strings i)))))))


  (let [x (Double/parseDouble (read-line))]
    (check-interval x))