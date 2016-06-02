(ns bob (:require [clojure.string :as str]))

(def yell-response "Whoa, chill out!")
(def question-response "Sure.")
(def empty-response "Fine. Be that way!")
(def question-words '("does" "what"))

(defn shouting? [input]
  (and
    (= (str/upper-case input) input)
    (not= (str/lower-case input) input)))

(defn response-for
  [input]
  (cond
    (str/blank? input) empty-response
    (shouting? input) yell-response
    (str/ends-with? (str/trim input) "?") question-response
    :else "Whatever."))
