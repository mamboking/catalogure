(ns catalogure.test.core
  (:use [catalogure.core])
  (:use [clojure.test]))

(deftest create-catalog-test
  (is (not (nil? (create-catalog {:id 1 :name "Test" :version 1}))) "Returned a nil catalog."))
