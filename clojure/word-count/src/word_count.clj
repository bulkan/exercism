(ns word-count
  (:require [clojure.string :as str]))

(defn- sanitize
  [phrase]
  (re-seq #"\w+" phrase))

(defn word-count
  [phrase]
  ((comp frequencies sanitize str/lower-case) phrase))
