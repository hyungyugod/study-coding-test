def solution(data, ext, val_ext, sort_by):
    p = ["code","date","maximum", "remain"]
    e = p.index(ext)
    s = p.index(sort_by)
    f_data = []

    for i in data:
        if i[e] < val_ext:
            f_data.append(i)
    return sorted(f_data, key = lambda x: x[s])