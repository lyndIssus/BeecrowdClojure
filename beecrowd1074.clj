(defn classify [x]
    (cond
        (= x 0)
        (str "NULL\n")
        (and (> x 0) (even? x))
        (str "EVEN POSITIVE\n")
        (and (< x 0) (even? x))
        (str "EVEN NEGATIVE\n")
        (and (> x 0) (odd? x))
        (str "ODD POSITIVE\n")
        (and (< x 0) (odd? x))
        (str "ODD NEGATIVE\n")
        )
    )

(defn myFunction [x]
    (let [numbers (repeatedly x read)] 
   
  (doall (map #(printf (classify %)) numbers))))

(let [x (read)]
  (myFunction x))