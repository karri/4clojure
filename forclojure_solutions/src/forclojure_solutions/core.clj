(ns forclojure-solutions.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; 1. Nothing but the Truth
true

;; 2. Simple Math
4

;; 3. Intro to Strings
"HELLO WORLD"

;; 4. Intro to Lists
:a :b :c

;; 5. Lists conj
'(1 2 3 4)

;; 6. Intro to Vectors
:a :b :c

;; 7. Vectors: conj
[ 1 2 3 4]

;; 8. Intro to Sets
#{:a :b :c :d}

;; 9. Sets : conj
2

;; 10. Intro to Maps
20

;; 11. Maps: conj
[:b 2]

;; 12. Intro to Sequences
3

;; 13. Sequences: rest
[20 30 40]

;; 14. Intro to functions
8

;; 15. Doule Down
#(* 2 %)
(partial * 2)

;; 16. Hello World
(fn [name] (str "Hello, " name "!"))

;; 17. Sequences: map
'(6 7 8)

;; 18. Sequences: filter
'(6 7)

;; 19. Local bindings
7

;; 20. Let it Be
[x 7 y 3 z 1]

;; Problems numbers above this are incorrect

;; 37. Regular Expressions
"ABC"

;; 64. Intro to reduce
+

;; 65. simple recursion
