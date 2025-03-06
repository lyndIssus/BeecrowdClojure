(defn check-interval [x y]
    (cond
      (and (< x 0) (< y 0)) (println "Q3") 
      (and (< x 0) (> y 0)) (println "Q2")
      (and (> x 0) (> y 0)) (println "Q1")
      (and (> x 0) (< y 0)) (println "Q4")
      (and (= x 0.0) (= y 0.0)) (println "Origem")
      (and (= x 0.0) (not= y 0.0)) (println "Eixo Y")
        (and (not= x 0.0) (= y 0.0)) (println "Eixo X"))
      )

(let [x(read) y(read)]
  (check-interval x y))