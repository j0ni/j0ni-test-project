(ns j0ni-test-project.core
  (:require [clojure.java.io :as io]
            [clojure.string :as string]))

(defn read-the-book []
  (let [text (string/split (slurp (io/resource "accelerando.txt")) #"\n")]
    (doseq [line text]
      (println line))
    text))
