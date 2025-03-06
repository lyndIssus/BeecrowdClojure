(defn classify [x]
    (cond
        (= x 2015)
        (str "1 A.C.\n")
        (and (> x 2015))
        (str (+ (- x 2015) 1)" A.C.\n")
        (and (< x 2015))
        (str (- 2015 x)" D.C.\n")
        
        
        )
    )

(defn pares [x]
    (let [numbers (repeatedly x read)] 
   
  (doall (map #(printf (classify %)) numbers))))

(let [x (read)]
  (pares x))
