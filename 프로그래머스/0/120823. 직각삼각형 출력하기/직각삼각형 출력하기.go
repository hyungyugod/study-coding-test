package main

import "fmt"

func main() {
    var n int
    fmt.Scan(&n)

    for i := 0; i < n; i++ {
        for j := 0; j < i+1; j++ {
            fmt.Print("*") // 줄바꿈 없는 출력
        }
        fmt.Println() // 줄바꿈
    }
}