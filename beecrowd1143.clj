(defn myFunction [x]
  (doall (map #(printf "%d %d %d\n" % (* % %) (* % % %)) (range 1 (+ x 1) 1))))

(let [x (read)]
  (myFunction x))