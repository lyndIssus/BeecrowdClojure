(defn stringify [z x]
    (if (= 0 (mod z x)) (str "" z "\n") (str z " "))
    )

(defn myFunction [x y]
  (doall (map #(printf (stringify % x)) (range 1 (+ y 1) 1))))



(let [x (read) y(read)]
  (myFunction x y))
