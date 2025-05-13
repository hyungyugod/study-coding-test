function solution(balls, share) {
    let d = Math.min(balls - share, share);
    let n = Math.max(balls - share, share);
    let counter = d;
    let real_n = 1;
    let real_d = 1;
    
    for (let i = 0; i < counter; i++){
        real_n *= balls;
        real_d *= d;
        
        balls -= 1;
        d -= 1;       
    }
    
    return real_n / real_d;
}