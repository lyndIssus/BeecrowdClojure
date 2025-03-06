(defn myFunction [x]
  (doall (map #(printf "%d^%d = %d\n" % 2 (* % %)) (range 2 (+ x 1) 2))))

(let [x (read)]
  (myFunction x))