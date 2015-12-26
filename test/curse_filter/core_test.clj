(ns curse-filter.core-test
  (:require [clojure.test :refer :all]
            [curse-filter.core :refer :all]))

(def textToCensor
  "Fuck you AsShole")

(def censoredWords
  ["asshole" "fuck"])

(deftest curseFilter-test
  (testing "Filtering out 2 curse words from a text"
    (is (= (curseFilter textToCensor censoredWords) "* you *"))))
