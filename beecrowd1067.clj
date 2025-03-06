(defn myFunction [x]
  (doall (map println (range 1 (+ x 1) 2))))


(let [x (read)]
     (myFunction x))
