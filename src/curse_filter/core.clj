(ns curse-filter.core)

(def textToCensor
  "Hello asshole, could you shut the fuck up?")

(def censoredWords
  ["asshole" "fuck"])


(defn curseFilter
  "method doc goes here"
  [text [word & restOfWords]]
  (if (not-empty word)
    (do (println word)
        (curseFilter text restOfWords))
    (println "over")
  )
)

(defn -main [& args]

  (curseFilter textToCensor censoredWords)
 )


