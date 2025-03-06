(require '[clojure.string :as str])

(defn check-interval [x y z]
  (if (and (< z (+ y x)) (< x (+ y z)) (< y (+ z x)))  
    (printf "Perimetro = %.1f\n" (+ x y z))  
    (printf "Area = %.1f\n" (/ (* (+ x y) z) 2))))


  (let [inputs (map #(Float/parseFloat %) (str/split (read-line) #"\s+"))]
      (apply check-interval inputs))