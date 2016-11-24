(ns barnett-newman.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth))

(defn draw []
  (background 145 81 46) ;; convert hex to rgb http://www.javascripter.net/faq/hextorgb.htm
  (fill 213 134 39)
  (no-stroke)
  (rect 145 0 10 600))

(defsketch example
  :title "Barnett Newman - Onement"
  :setup setup
  :draw draw
  :size [300 600])

(defn -main [& args])
