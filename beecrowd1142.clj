(defn myFunction [x]
  (doall (map #(printf "%d %d %d PUM\n" % (+ % 1) (+ % 2)) (range 1 (* x 4) 4))))

(let [x (read)]
  (myFunction x))