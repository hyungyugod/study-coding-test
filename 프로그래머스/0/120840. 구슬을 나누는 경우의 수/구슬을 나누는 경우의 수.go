package main

func gcd64(a, b int64) int64 {
    for b != 0 {
        a, b = b, a%b
    }
    return a
}

func solution(balls int, share int) int {
    n, r := balls, share
    if r > n-r { 
        r = n - r
    }

    res := int64(1)
    for i := 1; i <= r; i++ {
        a := int64(n - r + i) 
        b := int64(i)         

      
        g := gcd64(a, b)
        a /= g
        b /= g

     
        g = gcd64(res, b)
        res /= g
        b /= g 

    
        res *= a
        
    }

    return int(res)
}