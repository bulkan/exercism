(ns rna-transcription)

(def rna {"G" "C"
          "C" "G"
          "T" "A"
          "A" "U"})

(defn dna-to-rna
  [nucleotide]
  (assert (not contains? rna nucleotide))
  (get rna nucleotide))

(defn to-rna
  [dna]
  (map dna-to-rna dna))
