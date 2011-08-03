(ns catalogure.core)

(defrecord Catalog [id name description version])

(defrecord TagHierarchy [id name description tag-tree])

(defrecord Item [id name description version attributes tags parent-item])

(defrecord ItemGroup [id name description version parent-item items])

(defrecord CatalogElements [id catalogId elements])

