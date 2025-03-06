(defn myFunction [x]
  (doall (map #(printf "%d x %d = %d\n" % x (* x %)) (range 1 11 1))))

(let [x (read)]
  (myFunction x))