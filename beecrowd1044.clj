(require '[clojure.string :as str])

(defn check-interval [x y]
    (let[mod1(mod x y) mod2(mod y x)]
        (if (and (not= 0.0 mod1) (not= 0.0 mod2)) (println "Nao sao Multiplos") (println "Sao Multiplos")
            
            ))
  )


  (let [inputs (map #(Float/parseFloat %) (str/split (read-line) #"\s+"))]
      (apply check-interval inputs))