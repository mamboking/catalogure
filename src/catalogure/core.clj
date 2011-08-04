(ns catalogure.core)

(defrecord Catalog [id name description version valid-from valid-to])

(defn create-catalog [{:keys [id name description version valid-from valid-to]}]
  (if (some nil? [id name version])
    (throw (Exception. "At a minimum you must provide at least :id :name and :version"))
    (Catalog. id name description version valid-from valid-to)))

(defrecord TagHierarchy [id name description tag-tree])

(defrecord Item [id name description version attributes tags parent-item])

(defrecord ItemGroup [id name description version parent-item items])

(defrecord CatalogElements [id catalogId elements])

