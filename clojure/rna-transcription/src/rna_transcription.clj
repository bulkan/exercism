(ns rna-transcription)

(def rna {:G "C"
          :C "G"
          :T "A"
          :A "U"})

(defn to-rna
  [dna]
  (str dna))
