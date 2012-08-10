(ns catalogure.core
  [:require catalogure.records])

(defn create-catalog [{:keys [id name description version valid-from valid-to]}]
  (if (some nil? [id name version])
    (throw (Exception. "At a minimum you must provide at least :id :name and :version"))
    (Catalog. id name description version valid-from valid-to)))


