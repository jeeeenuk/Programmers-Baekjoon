function solution(num_str) {
    var answer = 0;
    var num = num_str.split("");
    
    for(let i=0; i<num.length; i++){
        answer += Number(num[i]);
    }
    return answer;
}