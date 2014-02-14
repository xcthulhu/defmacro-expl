(ns defmacro-expl.core-test
  (:require [clojure.test :refer :all]
            [defmacro-expl.core :refer :all]))

(defmacro! square [x] `(* ~x ~x))

(deftest defmacro!-test
  (testing "Making sure that IO operation happen exactly once for the macro"
    (is (= (with-out-str (square (do (print "Yolo") 5)))
           "Yolo"))))
