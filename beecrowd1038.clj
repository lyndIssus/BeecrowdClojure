(def values [4.0 4.5 5.0 2.0 1.50])

(defn check-interval [x y]
  (let [R (* (get values (- x 1)) y)]
    (println "Total: R$" (format "%.2f" R))))

(let [x (read) y (read)]
  (check-interval x y))