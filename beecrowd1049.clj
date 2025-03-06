(require '[clojure.string :as str])

(defn check-interval [x y z]
  (cond
     (= x "vertebrado")
      (cond
            (= y "ave")
                (if (= z "carnivoro")
                      (println "aguia")
                      (println "pomba"))
            (= y "mamifero")
                (if (= z "onivoro")
                      (println "homem")
                      (println "vaca"))
      )
      :else
      (cond
          (= y "inseto")
                (if (= z "hematofago")
                      (println "pulga")
                      (println "lagarta"))
            (= y "anelideo")
                (if (= z "hematofago")
                      (println "sanguessuga")
                      (println "minhoca"))
          )
      )
      
      )

(let [a (str(read))
      b(str(read))
      c(str(read))]
    (check-interval a b c))