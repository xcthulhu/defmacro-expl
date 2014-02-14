(ns defmacro-expl.core)

(defmacro defmacro! [& args]
  `(defmacro ~@args))
