/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    var result;
    var onces =false;
    return function(...args){
        if(!onces)
        {
            result = fn(...args);
            onces= true;
        return result;
        }
        return undefined;
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
