(require '[clojure.string :as str])

(defn check-interval [x y]
        (cond
            (= x y) (println "O JOGO DUROU 24 HORA(S)")
            (> x y) (printf "O JOGO DUROU %.0f HORA(S)\n" (+ (- 24 x) y))
            (< x y) (printf "O JOGO DUROU %.0f HORA(S)\n" (- y x))))
  


  (let [inputs (map #(Float/parseFloat %) (str/split (read-line) #"\s+"))]
      (apply check-interval inputs))    