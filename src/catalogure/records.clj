(ns catalogure.records)

(defrecord Catalog [id name description version valid-from valid-to])

(defrecord TagHierarchy [id name description tag-tree])

(defrecord Item [id name description version attributes tags parent-item])

(defrecord CatalogElements [id catalogId elements])
