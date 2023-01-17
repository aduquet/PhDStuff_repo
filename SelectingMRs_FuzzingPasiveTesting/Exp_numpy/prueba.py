import numpy as np

a = [3,4]
eye = np.eye(10)


passkwargs = {k: v for k, v in a.items()}
# np.sum()
print(np.prod(a))
print(passkwargs)