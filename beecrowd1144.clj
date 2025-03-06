(defn pares [x]
  (doall (map println (range 1 (+ x 1) 2))))


(let [x (read)]
     (pares x))
