(defn check-interval [x y z a]
  (let [R (/ (+ (* x 2.0) (* y 3.0) (* z 4.0) (* a 1.0)) 10)]
    (printf "Media: %.1f\n" (float R))
    (cond
      (< R 5.0)
        (println "Aluno reprovado.") 
      (> R 6.9)
        (println "Aluno aprovado.")
      :else     
        (do (println "Aluno em exame.")
            (let [b (Float/parseFloat (read-line))]
              (println "Nota do exame:" b)
              (if (<= 5.0 (/ (+ R b) 2))
                (println "Aluno aprovado.")
                (println "Aluno reprovado."))
              (printf "Media final: %.1f\n" (float(/ (+ R b) 2))))))))

(let [inputs (map #(Float/parseFloat %) (clojure.string/split (read-line) #"\s+"))]
  (apply check-interval inputs))