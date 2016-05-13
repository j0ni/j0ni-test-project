(ns j0ni-test-project.core-test
  (:require [clojure.test :refer :all]
            [j0ni-test-project.core :refer :all]))

(deftest env-var-test
  (testing "what do the environment variables look like"
    (println "FOO" (System/getenv "FOO"))))

(deftest read-me-a-story-of-the-singularity
  (testing "I don't even, but I likes me som Stross"
    (let [the-text (read-the-book)]
      (is (sequential? the-text))
      (is (every? string? the-text)))))
