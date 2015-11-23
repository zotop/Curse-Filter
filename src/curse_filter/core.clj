(ns curse-filter.core)

(def textToCensor
  "Hello Asshole, could you shut the Fuck up?")

(def censoredWords
  ["asshole" "fuck"])


(defn curseFilter
  [text [word & restOfWords]]
  (if (not-empty word)
    (do
      (def wordPattern (re-pattern (str "(?i)" word))) ;; (?i)-> case insensitive
      (def newText (clojure.string/replace text wordPattern "*"))
      (curseFilter newText restOfWords)
    )
    (println text)
  )
)

(defn -main [& args]

  (curseFilter textToCensor censoredWords)
 )


