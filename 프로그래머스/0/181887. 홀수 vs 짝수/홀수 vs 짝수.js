function solution(num_list) {
    var answer = 0;
    let even = 0;
    let odd = 0;
    for(let i = 0; i < num_list.length; i++){
        i % 2 === 0 ? even += num_list[i] : odd += num_list[i];
    }
    return even > odd ? even : odd;
}