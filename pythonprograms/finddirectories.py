import os
def countfilesdir():
    dir_path = '/Users/kinduvadana/Downloads'
    count = 0
    for path in os.listdir(dir_path):
        if os.path.isfile(os.path.join(dir_path, path)) or os.path.isdir(os.path.join(dir_path, path)):
            count += 1
    print("file and directories count",count)


if __name__ == '__main__':
    countfilesdir()
else:
    print("You dont have access to run this function")
