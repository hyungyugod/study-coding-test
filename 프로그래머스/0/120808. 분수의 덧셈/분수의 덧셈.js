function solution(numer1, denom1, numer2, denom2) {
    let n = numer1 * denom2 + denom1 * numer2;
    let d = denom1 * denom2;
    let g = gcd(n, d);
    
    return [(n/g), (d/g)]; 
}

function gcd (a, b) {
    if (b === 0) return a; 
    
    return gcd (b, a % b);
}