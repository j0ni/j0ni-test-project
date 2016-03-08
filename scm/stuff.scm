(require-extension posix)

(define (do-a-thing a n)
  (define (iter n m)
    (when (< n m)
      (print "hello there, here's " a " number " n)
      (sleep 1)
      (iter (+ n 1) m)))
  (iter 0 n))

(let ((thing (cadr (command-line-arguments))))
  (do-a-thing thing 30))

(exit)
