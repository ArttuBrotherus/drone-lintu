(ns drone-lintu.views
  (:require
   [re-frame.core :as re-frame]
   [drone-lintu.styles :as styles]
   [drone-lintu.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      {:class (styles/level1)}
      "Hello from " @name]
     ]))
