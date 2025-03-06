(require '[clojure.string :as str])

(defn check-interval [x y z w]
  (cond
    (and (= x z) (= y w))
    (println "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
    (= x z)
      (if (> y w)
       (printf "O JOGO DUROU 23 HORA(S) E %.0f MINUTO(S)\n"  (+ 60 (- w y)))
        (printf "O JOGO DUROU 0 HORA(S) E %.0f MINUTO(S)\n" (- w y)))
    (> x z) 
    (if (> y w)
      (printf "O JOGO DUROU %.0f HORA(S) E %.0f MINUTO(S)\n" (+ 23 (- z x)) (+ 60 (- w y)))
    (printf "O JOGO DUROU %.0f HORA(S) E %.0f MINUTO(S)\n" (+  24 (- z x)) (- w y)))
  
    :else
    
    (if (> y w)
      (printf "O JOGO DUROU %.0f HORA(S) E %.0f MINUTO(S)\n" (- z x 1) (+ 60 (- w y)))
    (printf "O JOGO DUROU %.0f HORA(S) E %.0f MINUTO(S)\n" (- z x) (- w y)))))

(let [inputs (map #(Float/parseFloat %) (str/split (read-line) #"\s+"))]
  (apply check-interval inputs))