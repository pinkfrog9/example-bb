(ns a)

(extend-protocol clojure.core/Inst
  java.time.Duration
  (inst-ms* [v] (.toMillis v))
  java.time.OffsetDateTime
  (inst-ms* [v] (.toEpochMilli (.toInstant v))))
