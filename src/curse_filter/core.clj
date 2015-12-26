(ns curse-filter.core
(:require [clojure.string :as str]))


(defn curseFilter
  [text [word & restOfWords]]
  (if (not-empty word)
    (do
      (def wordPattern (re-pattern (str "(?i)" word))) ;; (?i)-> case insensitive
      (def newText (clojure.string/replace text wordPattern "*"))
      (curseFilter newText restOfWords)
    )
    text ;; return filtered text
  )
)

(defn -main [& args]
  (def textToCensor (nth args 0))
  (def censoredWords (str/split (nth args 1) #","))
  (println (curseFilter textToCensor censoredWords))
 )


