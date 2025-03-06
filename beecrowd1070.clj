(defn myFunction [x]
    (cond 
    (odd? x)
    (doall (map println (range x (+ x 12) 2)))
    :else
    (doall (map println (range (+ x 1) (+ x 12) 2)))))


(let [x (read)]
     (myFunction x))