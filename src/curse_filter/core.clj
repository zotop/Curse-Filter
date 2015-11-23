(ns curse-filter.core)

(def textToCensor
  "Hello asshole, could you shut the fuck up?")

(def censoredWords
  ["asshole" "fuck"])


(defn curseFilter
  "method doc goes here"
  [text [word & restOfWords]]
  (if (not-empty word)
    (do
      (def newText (clojure.string/replace text word "*"))
      (curseFilter newText restOfWords)
    )
    (println text)
  )
)

(defn -main [& args]

  (curseFilter textToCensor censoredWords)
 )


