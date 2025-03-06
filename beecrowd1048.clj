(require '[clojure.string :as str])

(defn check-interval [x]
  (cond
     (and (<= 0.0 x) (<= x 400))
      (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n" (* 1.15 x) (- (* 1.15 x) x))
      (and (< 400.0 x) (<= x 800.00))
      (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n" (* 1.12 x) (- (* 1.12 x) x))
      (and (< 800.0 x) (<= x 1200.00))
      (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n" (* 1.10 x) (- (* 1.10 x) x))
      (and (< 1200.0 x) (<= x 2000))
      (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n" (* 1.07 x) (- (* 1.07 x) x))
      (< 2000 x)
      (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n" (* 1.04 x) (- (* 1.04 x) x))
      
      ))

(let [inputs (map #(Float/parseFloat %) (str/split (read-line) #"\s+"))]