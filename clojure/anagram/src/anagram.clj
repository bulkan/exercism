(ns anagram
  (:require [clojure.string :refer [lower-case]]))

(defn anagrams-for [word candidates]
  (reduce
    (fn [final candidate]
      (let [word (lower-case word) lower-cased-candidate (lower-case candidate)]
        (if (and
              (not (= word lower-cased-candidate))
              (= (frequencies word) (frequencies lower-cased-candidate)))
            (conj final candidate)
            final)))
    []
    candidates))
