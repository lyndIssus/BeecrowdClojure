(def a (read))
(def b (read))
(def c (read))

(def delta (- (* b b) (* 4 a c)))
(def r1 (/ (+ (- b) (Math/sqrt delta)) (* 2 a)))
(def r2 (/ (+ (- b) (- (Math/sqrt delta))) (* 2 a)))

(println (cond (or (= a 0.0) (< delta 0.0))
               "Impossivel calcular"
               :else (format "R1 = %.5f\nR2 = %.5f" r1 r2)))