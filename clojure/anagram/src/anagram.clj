(ns anagram)

(defn check-length [a b]
  (= (count a) (count b)))

(defn words [word candidates]
  (filter
    (partial check-length word)
    candidates))



(defn anagrams-for [word candidates]
  (words word candidates))

; reduce candidates
; check letters
; create a set from the words and they should be equal


; An anagram is direct word switch or word play, the result of rearranging the
; letters of a word or phrase to produce a new word or phrase, using all the
; original letters exactly once
